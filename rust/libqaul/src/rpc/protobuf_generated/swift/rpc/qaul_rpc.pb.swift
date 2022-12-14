// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: rpc/qaul_rpc.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// Identification to which module the message shall be
/// handed to.
enum Qaul_Rpc_Modules: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// default value, when nothing is defined.
  /// drop this message
  case none // = 0

  /// RPC related messages
  /// such as authorisation etc.
  case rpc // = 1

  /// node information
  case node // = 2

  /// user accounts on this node
  case useraccounts // = 3

  /// all users in the network
  case users // = 4

  /// routing information
  case router // = 5

  /// feed module handling
  ///
  /// send and retrieve feed messages
  case feed // = 6

  /// connection information to other nodes
  case connections // = 7

  /// debug information & settings
  case debug // = 8

  /// chat group handling
  ///
  /// manage chat groups and group invites
  case group // = 9

  /// chat module
  /// to send chat messages, get a
  /// conversation overiew and all
  /// messages within a conversation
  case chat // = 10

  /// all functions to send and manage
  /// files sent into a chat conversation
  case chatfile // = 11

  /// BLE module handling
  case ble // = 12

  /// Real Time Communication handling
  case rtc // = 13

  /// Delay Tolerant Networking
  case dtn // = 14
  case UNRECOGNIZED(Int)

  init() {
    self = .none
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .none
    case 1: self = .rpc
    case 2: self = .node
    case 3: self = .useraccounts
    case 4: self = .users
    case 5: self = .router
    case 6: self = .feed
    case 7: self = .connections
    case 8: self = .debug
    case 9: self = .group
    case 10: self = .chat
    case 11: self = .chatfile
    case 12: self = .ble
    case 13: self = .rtc
    case 14: self = .dtn
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .none: return 0
    case .rpc: return 1
    case .node: return 2
    case .useraccounts: return 3
    case .users: return 4
    case .router: return 5
    case .feed: return 6
    case .connections: return 7
    case .debug: return 8
    case .group: return 9
    case .chat: return 10
    case .chatfile: return 11
    case .ble: return 12
    case .rtc: return 13
    case .dtn: return 14
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Qaul_Rpc_Modules: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Qaul_Rpc_Modules] = [
    .none,
    .rpc,
    .node,
    .useraccounts,
    .users,
    .router,
    .feed,
    .connections,
    .debug,
    .group,
    .chat,
    .chatfile,
    .ble,
    .rtc,
    .dtn,
  ]
}

#endif  // swift(>=4.2)

/// The main libqaul RPC message container.
/// All RPC messages from and to libqaul are packed
/// into this container.
struct Qaul_Rpc_QaulRpc {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// which module to approach
  var module: Qaul_Rpc_Modules = .none

  /// can be used to identify responses
  var requestID: String = String()

  /// authorisation
  /// binary user id
  var userID: Data = Data()

  /// the protobuf encoded binary message data
  /// which is passed to the module.
  var data: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "qaul.rpc"

extension Qaul_Rpc_Modules: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "NONE"),
    1: .same(proto: "RPC"),
    2: .same(proto: "NODE"),
    3: .same(proto: "USERACCOUNTS"),
    4: .same(proto: "USERS"),
    5: .same(proto: "ROUTER"),
    6: .same(proto: "FEED"),
    7: .same(proto: "CONNECTIONS"),
    8: .same(proto: "DEBUG"),
    9: .same(proto: "GROUP"),
    10: .same(proto: "CHAT"),
    11: .same(proto: "CHATFILE"),
    12: .same(proto: "BLE"),
    13: .same(proto: "RTC"),
    14: .same(proto: "DTN"),
  ]
}

extension Qaul_Rpc_QaulRpc: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QaulRpc"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "module"),
    2: .standard(proto: "request_id"),
    3: .standard(proto: "user_id"),
    4: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.module) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.requestID) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.userID) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.module != .none {
      try visitor.visitSingularEnumField(value: self.module, fieldNumber: 1)
    }
    if !self.requestID.isEmpty {
      try visitor.visitSingularStringField(value: self.requestID, fieldNumber: 2)
    }
    if !self.userID.isEmpty {
      try visitor.visitSingularBytesField(value: self.userID, fieldNumber: 3)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_QaulRpc, rhs: Qaul_Rpc_QaulRpc) -> Bool {
    if lhs.module != rhs.module {return false}
    if lhs.requestID != rhs.requestID {return false}
    if lhs.userID != rhs.userID {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
