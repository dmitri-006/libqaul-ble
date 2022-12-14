// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: connections/ble/ble_rpc.proto
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

/// BLE RPC Message Container
///
/// Union of all messages that can be sent or received
/// via RPC between the UI and libqaul
struct Qaul_Rpc_Ble_Ble {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var message: Qaul_Rpc_Ble_Ble.OneOf_Message? = nil

  var infoRequest: Qaul_Rpc_Ble_InfoRequest {
    get {
      if case .infoRequest(let v)? = message {return v}
      return Qaul_Rpc_Ble_InfoRequest()
    }
    set {message = .infoRequest(newValue)}
  }

  var infoResponse: Qaul_Rpc_Ble_InfoResponse {
    get {
      if case .infoResponse(let v)? = message {return v}
      return Qaul_Rpc_Ble_InfoResponse()
    }
    set {message = .infoResponse(newValue)}
  }

  var startRequest: Qaul_Rpc_Ble_StartRequest {
    get {
      if case .startRequest(let v)? = message {return v}
      return Qaul_Rpc_Ble_StartRequest()
    }
    set {message = .startRequest(newValue)}
  }

  var stopRequest: Qaul_Rpc_Ble_StopRequest {
    get {
      if case .stopRequest(let v)? = message {return v}
      return Qaul_Rpc_Ble_StopRequest()
    }
    set {message = .stopRequest(newValue)}
  }

  var discoveredRequest: Qaul_Rpc_Ble_DiscoveredRequest {
    get {
      if case .discoveredRequest(let v)? = message {return v}
      return Qaul_Rpc_Ble_DiscoveredRequest()
    }
    set {message = .discoveredRequest(newValue)}
  }

  var discoveredResponse: Qaul_Rpc_Ble_DiscoveredResponse {
    get {
      if case .discoveredResponse(let v)? = message {return v}
      return Qaul_Rpc_Ble_DiscoveredResponse()
    }
    set {message = .discoveredResponse(newValue)}
  }

  var rightsRequest: Qaul_Rpc_Ble_RightsRequest {
    get {
      if case .rightsRequest(let v)? = message {return v}
      return Qaul_Rpc_Ble_RightsRequest()
    }
    set {message = .rightsRequest(newValue)}
  }

  var rightsResult: Qaul_Rpc_Ble_RightsResult {
    get {
      if case .rightsResult(let v)? = message {return v}
      return Qaul_Rpc_Ble_RightsResult()
    }
    set {message = .rightsResult(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  enum OneOf_Message: Equatable {
    case infoRequest(Qaul_Rpc_Ble_InfoRequest)
    case infoResponse(Qaul_Rpc_Ble_InfoResponse)
    case startRequest(Qaul_Rpc_Ble_StartRequest)
    case stopRequest(Qaul_Rpc_Ble_StopRequest)
    case discoveredRequest(Qaul_Rpc_Ble_DiscoveredRequest)
    case discoveredResponse(Qaul_Rpc_Ble_DiscoveredResponse)
    case rightsRequest(Qaul_Rpc_Ble_RightsRequest)
    case rightsResult(Qaul_Rpc_Ble_RightsResult)

  #if !swift(>=4.1)
    static func ==(lhs: Qaul_Rpc_Ble_Ble.OneOf_Message, rhs: Qaul_Rpc_Ble_Ble.OneOf_Message) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.infoRequest, .infoRequest): return {
        guard case .infoRequest(let l) = lhs, case .infoRequest(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.infoResponse, .infoResponse): return {
        guard case .infoResponse(let l) = lhs, case .infoResponse(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.startRequest, .startRequest): return {
        guard case .startRequest(let l) = lhs, case .startRequest(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.stopRequest, .stopRequest): return {
        guard case .stopRequest(let l) = lhs, case .stopRequest(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.discoveredRequest, .discoveredRequest): return {
        guard case .discoveredRequest(let l) = lhs, case .discoveredRequest(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.discoveredResponse, .discoveredResponse): return {
        guard case .discoveredResponse(let l) = lhs, case .discoveredResponse(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.rightsRequest, .rightsRequest): return {
        guard case .rightsRequest(let l) = lhs, case .rightsRequest(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.rightsResult, .rightsResult): return {
        guard case .rightsResult(let l) = lhs, case .rightsResult(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}
}

/// UI request for information on devices and module status
struct Qaul_Rpc_Ble_InfoRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BLE Info Response Message
///
/// Contains information on the status of the module,
/// as well as all available BLE devices 
struct Qaul_Rpc_Ble_InfoResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the small 16 byte BLE id
  var smallID: Data = Data()

  /// status of the module
  var status: String = String()

  /// devices
  var deviceInfo: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Request BLE module to start
///
/// Start message sent from UI to libqaul.
///
/// This message only has an effect if the module
/// has not already started.
struct Qaul_Rpc_Ble_StartRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Request BLE module to stop
///
/// Stop message sent from UI to libqaul.
///
/// This message only has an effect if the module
/// was started earlier and is running.
struct Qaul_Rpc_Ble_StopRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Request Discovered Nodes on BLE
///
/// Message sent from UI to libqaul.
struct Qaul_Rpc_Ble_DiscoveredRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// All Discovered Nodes
///
/// Answer from libqaul to UI on DiscoveredRequest
struct Qaul_Rpc_Ble_DiscoveredResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// number of nodes in discovery table
  var nodesCount: UInt32 = 0

  /// number of nodes in to_confirm table
  var toConfirmCount: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Request Rights
struct Qaul_Rpc_Ble_RightsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Rights Request Results
struct Qaul_Rpc_Ble_RightsResult {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var rightsGranted: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "qaul.rpc.ble"

extension Qaul_Rpc_Ble_Ble: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Ble"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "info_request"),
    2: .standard(proto: "info_response"),
    3: .standard(proto: "start_request"),
    4: .standard(proto: "stop_request"),
    5: .standard(proto: "discovered_request"),
    6: .standard(proto: "discovered_response"),
    7: .standard(proto: "rights_request"),
    8: .standard(proto: "rights_result"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try {
        var v: Qaul_Rpc_Ble_InfoRequest?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .infoRequest(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .infoRequest(v)
        }
      }()
      case 2: try {
        var v: Qaul_Rpc_Ble_InfoResponse?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .infoResponse(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .infoResponse(v)
        }
      }()
      case 3: try {
        var v: Qaul_Rpc_Ble_StartRequest?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .startRequest(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .startRequest(v)
        }
      }()
      case 4: try {
        var v: Qaul_Rpc_Ble_StopRequest?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .stopRequest(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .stopRequest(v)
        }
      }()
      case 5: try {
        var v: Qaul_Rpc_Ble_DiscoveredRequest?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .discoveredRequest(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .discoveredRequest(v)
        }
      }()
      case 6: try {
        var v: Qaul_Rpc_Ble_DiscoveredResponse?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .discoveredResponse(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .discoveredResponse(v)
        }
      }()
      case 7: try {
        var v: Qaul_Rpc_Ble_RightsRequest?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .rightsRequest(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .rightsRequest(v)
        }
      }()
      case 8: try {
        var v: Qaul_Rpc_Ble_RightsResult?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .rightsResult(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .rightsResult(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    switch self.message {
    case .infoRequest?: try {
      guard case .infoRequest(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }()
    case .infoResponse?: try {
      guard case .infoResponse(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }()
    case .startRequest?: try {
      guard case .startRequest(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }()
    case .stopRequest?: try {
      guard case .stopRequest(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }()
    case .discoveredRequest?: try {
      guard case .discoveredRequest(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }()
    case .discoveredResponse?: try {
      guard case .discoveredResponse(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }()
    case .rightsRequest?: try {
      guard case .rightsRequest(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    }()
    case .rightsResult?: try {
      guard case .rightsResult(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_Ble, rhs: Qaul_Rpc_Ble_Ble) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_InfoRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".InfoRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_InfoRequest, rhs: Qaul_Rpc_Ble_InfoRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_InfoResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".InfoResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "small_id"),
    2: .same(proto: "status"),
    3: .standard(proto: "device_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.smallID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.status) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.deviceInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.smallID.isEmpty {
      try visitor.visitSingularBytesField(value: self.smallID, fieldNumber: 1)
    }
    if !self.status.isEmpty {
      try visitor.visitSingularStringField(value: self.status, fieldNumber: 2)
    }
    if !self.deviceInfo.isEmpty {
      try visitor.visitSingularBytesField(value: self.deviceInfo, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_InfoResponse, rhs: Qaul_Rpc_Ble_InfoResponse) -> Bool {
    if lhs.smallID != rhs.smallID {return false}
    if lhs.status != rhs.status {return false}
    if lhs.deviceInfo != rhs.deviceInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_StartRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StartRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_StartRequest, rhs: Qaul_Rpc_Ble_StartRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_StopRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StopRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_StopRequest, rhs: Qaul_Rpc_Ble_StopRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_DiscoveredRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DiscoveredRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_DiscoveredRequest, rhs: Qaul_Rpc_Ble_DiscoveredRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_DiscoveredResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DiscoveredResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "nodes_count"),
    2: .standard(proto: "to_confirm_count"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.nodesCount) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.toConfirmCount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.nodesCount != 0 {
      try visitor.visitSingularUInt32Field(value: self.nodesCount, fieldNumber: 1)
    }
    if self.toConfirmCount != 0 {
      try visitor.visitSingularUInt32Field(value: self.toConfirmCount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_DiscoveredResponse, rhs: Qaul_Rpc_Ble_DiscoveredResponse) -> Bool {
    if lhs.nodesCount != rhs.nodesCount {return false}
    if lhs.toConfirmCount != rhs.toConfirmCount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_RightsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RightsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_RightsRequest, rhs: Qaul_Rpc_Ble_RightsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Rpc_Ble_RightsResult: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RightsResult"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "rights_granted"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.rightsGranted) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.rightsGranted != false {
      try visitor.visitSingularBoolField(value: self.rightsGranted, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Rpc_Ble_RightsResult, rhs: Qaul_Rpc_Ble_RightsResult) -> Bool {
    if lhs.rightsGranted != rhs.rightsGranted {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
