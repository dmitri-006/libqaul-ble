// Copyright (c) 2021 Open Community Project Association https://ocpa.ch
// This software is published under the AGPLv3 license.

//! # Build Rust Prerequisits
//!
//! These Actions are executed before the rust code get's compiled.
//! It does the following things:
//!
//! * Create rust code files from protobuf files
//! * Copy the generated files to the right locations

use std::env;
use std::fs;
use std::path::{Path, PathBuf};
use std::process::Command;

#[cfg(target_os = "windows")]
const EXPECTED_JVM_FILENAME: &str = "jvm.dll";
#[cfg(any(
    target_os = "android",
    target_os = "freebsd",
    target_os = "linux",
    target_os = "netbsd",
    target_os = "openbsd"
))]
const EXPECTED_JVM_FILENAME: &str = "libjvm.so";
#[cfg(target_os = "macos")]
const EXPECTED_JVM_FILENAME: &str = "libjli.dylib";

fn main() {
    if cfg!(feature = "invocation") {

        let java_home = match env::var("JAVA_HOME") {
            Ok(java_home) => PathBuf::from(java_home),
            Err(_) => find_java_home().expect(
                "Failed to find Java home directory. \
                 Try setting JAVA_HOME",
            ),
        };

        let libjvm_path =
            find_libjvm(&java_home).expect("Failed to find libjvm.so. Check JAVA_HOME");

        println!("cargo:rustc-link-search=native={}", libjvm_path.display());

        // On Windows, we need additional file called `jvm.lib`
        // and placed inside `JAVA_HOME\lib` directory.
        if cfg!(windows) {
            let lib_path = java_home.join("lib");
            println!("cargo:rustc-link-search={}", lib_path.display());
        }

        println!("cargo:rerun-if-env-changed=JAVA_HOME");

        // On MacOS, we need to link to libjli instead of libjvm as a workaround
        // to a Java8 bug. See here for more information:
        // https://bugs.openjdk.java.net/browse/JDK-7131356
        if env::var("CARGO_CFG_TARGET_OS").unwrap() == "macos" {
            println!("cargo:rustc-link-lib=dylib=jli");
        } else {
            println!("cargo:rustc-link-lib=dylib=jvm");
        }
    }

    let mut prost_build = prost_build::Config::new();

    // make chat messages serializable
    // in order to save them in the data base
    prost_build.type_attribute(
        "ChatMessage",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );
    prost_build.type_attribute(
        "MessageReceptionConfirmed",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );

    // make network messaging serializable
    // in order to save them in the data base
    prost_build.type_attribute(
        "Container",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );
    prost_build.type_attribute(
        "Envelope",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );
    prost_build.type_attribute(
        "Confirmation",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );

    // make group messages serializable
    // in order to save them in the data base
    prost_build.type_attribute(
        "GroupInfo",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );
    prost_build.type_attribute(
        "GroupMember",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );

    // make crypto message serializable
    // in order to save them in the data base
    prost_build.type_attribute(
        "Encrypted",
        "#[derive(serde::Serialize, serde::Deserialize)]",
    );
    prost_build.type_attribute("Data", "#[derive(serde::Serialize, serde::Deserialize)]");

    // compile these protobuf files
    prost_build
        .compile_protos(
            &[
                "rpc/qaul_rpc.proto",
                "rpc/debug.proto",
                "connections/connections.proto",
                "node/node.proto",
                "node/user_accounts.proto",
                "router/users.proto",
                "router/router.proto",
                "router/router_net_info.proto",
                "services/feed/feed.proto",
                "services/feed/feed_net.proto",
                "services/group/group_net.proto",
                "services/group/group_rpc.proto",
                "services/rtc/rtc_net.proto",
                "services/rtc/rtc_rpc.proto",
                "services/chat/chat.proto",
                "services/chat/chatfile_net.proto",
                "services/chat/chatfile_rpc.proto",
                "connections/ble/ble.proto",
                "connections/ble/ble_net.proto",
                "connections/ble/ble_rpc.proto",
                "services/messaging/messaging.proto",
                "services/dtn/dtn_rpc.proto",
            ],
            &["src"],
        )
        .unwrap();

    // copy generated protobuf files to their module locations
    let out_dir = env::var_os("OUT_DIR").unwrap();
    let to = Path::new("src/rpc/protobuf_generated/rust");

    // copy to central rust file folder
    // UI rpc
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.rs"),
        to.join("qaul.rpc.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.debug.rs"),
        to.join("qaul.rpc.debug.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.connections.rs"),
        to.join("qaul.rpc.connections.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.node.rs"),
        to.join("qaul.rpc.node.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.user_accounts.rs"),
        to.join("qaul.rpc.user_accounts.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.users.rs"),
        to.join("qaul.rpc.users.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.router.rs"),
        to.join("qaul.rpc.router.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.feed.rs"),
        to.join("qaul.rpc.feed.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.chat.rs"),
        to.join("qaul.rpc.chat.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.chatfile.rs"),
        to.join("qaul.rpc.chatfile.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.group.rs"),
        to.join("qaul.rpc.group.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.dtn.rs"),
        to.join("qaul.rpc.dtn.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.rtc.rs"),
        to.join("qaul.rpc.rtc.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.rpc.ble.rs"),
        to.join("qaul.rpc.ble.rs"),
    )
    .unwrap();
    // system communication
    fs::copy(
        Path::new(&out_dir).join("qaul.sys.ble.rs"),
        to.join("qaul.sys.ble.rs"),
    )
    .unwrap();
    // network communication
    fs::copy(
        Path::new(&out_dir).join("qaul.net.router_net_info.rs"),
        to.join("qaul.net.router_net_info.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.messaging.rs"),
        to.join("qaul.net.messaging.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.feed.rs"),
        to.join("qaul.net.feed.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.chatfile.rs"),
        to.join("qaul.net.chatfile.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.group.rs"),
        to.join("qaul.net.group.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.rtc.rs"),
        to.join("qaul.net.rtc.rs"),
    )
    .unwrap();
    fs::copy(
        Path::new(&out_dir).join("qaul.net.ble.rs"),
        to.join("qaul.net.ble.rs"),
    )
    .unwrap();

    // copy to modules
    // UI rpc
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.rs"),
        Path::new("src/rpc/qaul.rpc.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.debug.rs"),
        Path::new("src/rpc/qaul.rpc.debug.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.connections.rs"),
        Path::new("src/connections/qaul.rpc.connections.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.node.rs"),
        Path::new("src/node/qaul.rpc.node.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.user_accounts.rs"),
        Path::new("src/node/qaul.rpc.user_accounts.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.users.rs"),
        Path::new("src/router/qaul.rpc.users.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.router.rs"),
        Path::new("src/router/qaul.rpc.router.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.feed.rs"),
        Path::new("src/services/feed/qaul.rpc.feed.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.chatfile.rs"),
        Path::new("src/services/chat/qaul.rpc.chatfile.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.chat.rs"),
        Path::new("src/services/chat/qaul.rpc.chat.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.group.rs"),
        Path::new("src/services/group/qaul.rpc.group.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.dtn.rs"),
        Path::new("src/services/dtn/qaul.rpc.dtn.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.rtc.rs"),
        Path::new("src/services/rtc/qaul.rpc.rtc.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.rpc.ble.rs"),
        Path::new("src/connections/ble/qaul.rpc.ble.rs"),
    )
    .unwrap();
    // system communication
    fs::copy(
        &Path::new(&out_dir).join("qaul.sys.ble.rs"),
        Path::new("src/connections/ble/qaul.sys.ble.rs"),
    )
    .unwrap();
    // network communication
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.router_net_info.rs"),
        Path::new("src/router/qaul.net.router_net_info.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.messaging.rs"),
        Path::new("src/services/messaging/qaul.net.messaging.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.feed.rs"),
        Path::new("src/services/feed/qaul.net.feed.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.chatfile.rs"),
        Path::new("src/services/chat/qaul.net.chatfile.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.group.rs"),
        Path::new("src/services/group/qaul.net.group.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.rtc.rs"),
        Path::new("src/services/rtc/qaul.net.rtc.rs"),
    )
    .unwrap();
    fs::copy(
        &Path::new(&out_dir).join("qaul.net.ble.rs"),
        Path::new("src/connections/ble/qaul.net.ble.rs"),
    )
    .unwrap();
}

/// To find Java home directory, we call
/// `java -XshowSettings:properties -version` command and parse its output to
/// find the line `java.home=<some path>`.
fn find_java_home() -> Option<PathBuf> {
    Command::new("java")
        .arg("-XshowSettings:properties")
        .arg("-version")
        .output()
        .ok()
        .and_then(|output| {
            let stdout = String::from_utf8_lossy(&output.stdout);
            let stderr = String::from_utf8_lossy(&output.stderr);
            for line in stdout.lines().chain(stderr.lines()) {
                if line.contains("java.home") {
                    let pos = line.find('=').unwrap() + 1;
                    let path = line[pos..].trim();
                    return Some(PathBuf::from(path));
                }
            }
            None
        })
}

fn find_libjvm<S: AsRef<Path>>(path: S) -> Option<PathBuf> {
    let walker = walkdir::WalkDir::new(path).follow_links(true);
    for entry in walker {
        let entry = match entry {
            Ok(entry) => entry,
            Err(_e) => continue,
        };

        let file_name = entry.file_name().to_str().unwrap_or("");

        if file_name == EXPECTED_JVM_FILENAME {
            return entry.path().parent().map(Into::into);
        }
    }

    None
}