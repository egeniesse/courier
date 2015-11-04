import Foundation
import SwiftyJSON

public struct WithPrimitiveDefaults: JSONSerializable {
    
    public let intWithDefault: Int?
    
    public let longWithDefault: Int?
    
    public let floatWithDefault: Float?
    
    public let doubleWithDefault: Double?
    
    public let booleanWithDefault: Bool?
    
    public let stringWithDefault: String?
    
    public let bytesWithDefault: String?
    
    public let enumWithDefault: Fruits?
    
    public init(
        intWithDefault: Int? = 1,
        longWithDefault: Int? = 2,
        floatWithDefault: Float? = 3.3,
        doubleWithDefault: Double? = 4.4,
        booleanWithDefault: Bool? = true,
        stringWithDefault: String? = "DEFAULT",
        bytesWithDefault: String? = "",
        enumWithDefault: Fruits? = .APPLE
    ) {
        self.intWithDefault = intWithDefault
        self.longWithDefault = longWithDefault
        self.floatWithDefault = floatWithDefault
        self.doubleWithDefault = doubleWithDefault
        self.booleanWithDefault = booleanWithDefault
        self.stringWithDefault = stringWithDefault
        self.bytesWithDefault = bytesWithDefault
        self.enumWithDefault = enumWithDefault
    }
    
    public static func read(json: JSON) -> WithPrimitiveDefaults {
        return WithPrimitiveDefaults(
            intWithDefault: json["intWithDefault"].int,
            longWithDefault: json["longWithDefault"].int,
            floatWithDefault: json["floatWithDefault"].float,
            doubleWithDefault: json["doubleWithDefault"].double,
            booleanWithDefault: json["booleanWithDefault"].bool,
            stringWithDefault: json["stringWithDefault"].string,
            bytesWithDefault: json["bytesWithDefault"].string,
            enumWithDefault: json["enumWithDefault"].string.map { Fruits.read($0) }
        )
    }
    public func write() -> JSON {
        var json: [String : JSON] = [:]
        if let intWithDefault = self.intWithDefault {
            json["intWithDefault"] = JSON(intWithDefault)
        }
        if let longWithDefault = self.longWithDefault {
            json["longWithDefault"] = JSON(longWithDefault)
        }
        if let floatWithDefault = self.floatWithDefault {
            json["floatWithDefault"] = JSON(floatWithDefault)
        }
        if let doubleWithDefault = self.doubleWithDefault {
            json["doubleWithDefault"] = JSON(doubleWithDefault)
        }
        if let booleanWithDefault = self.booleanWithDefault {
            json["booleanWithDefault"] = JSON(booleanWithDefault)
        }
        if let stringWithDefault = self.stringWithDefault {
            json["stringWithDefault"] = JSON(stringWithDefault)
        }
        if let bytesWithDefault = self.bytesWithDefault {
            json["bytesWithDefault"] = JSON(bytesWithDefault)
        }
        if let enumWithDefault = self.enumWithDefault {
            json["enumWithDefault"] = JSON(enumWithDefault.write())
        }
        return JSON(json)
    }
}