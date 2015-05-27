

package org.coursera.records.test

import javax.annotation.Generated

import com.linkedin.data.DataMap
import com.linkedin.data.schema.UnionDataSchema
import com.linkedin.data.template.Custom
import com.linkedin.data.template.GetMode
import com.linkedin.data.template.SetMode
import com.linkedin.data.template.RecordTemplate
import com.linkedin.data.template.RequiredFieldNotPresentException
import com.linkedin.data.template.TemplateOutputCastException
import com.linkedin.data.template.UnionTemplate
import org.coursera.courier.data.DataTemplates
import org.coursera.courier.data.DataTemplates.DataConversion
import scala.runtime.ScalaRunTime
import com.linkedin.data.template.DataTemplateUtil
import com.linkedin.data.schema.RecordDataSchema
import javax.annotation.Generated




@Generated(value = Array("WithOptionalPrimitiveTyperefs"), comments="Courier Data Template. Generated from TODO", date = "Wed May 27 17:11:07 PDT 2015")
final class WithOptionalPrimitiveTyperefs private (private val dataMap: DataMap)
  extends RecordTemplate(dataMap, WithOptionalPrimitiveTyperefs.SCHEMA) with Product {
  import WithOptionalPrimitiveTyperefs._

  
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val intField: Option[Int] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.intField, classOf[java.lang.Integer], GetMode.STRICT)).map(Int.unbox(_))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val longField: Option[Long] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.longField, classOf[java.lang.Long], GetMode.STRICT)).map(Long.unbox(_))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val floatField: Option[Float] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.floatField, classOf[java.lang.Float], GetMode.STRICT)).map(Float.unbox(_))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val doubleField: Option[Double] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.doubleField, classOf[java.lang.Double], GetMode.STRICT)).map(Double.unbox(_))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val booleanField: Option[Boolean] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.booleanField, classOf[java.lang.Boolean], GetMode.STRICT)).map(Boolean.unbox(_))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val stringField: Option[String] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.stringField, classOf[java.lang.String], GetMode.STRICT))
      
  
    

    /* TODO(jbetz): Decide on order of fields and decide how to handle optional fields and defaults. Note that decisions here will impact source backward compatibility! */
    
        lazy val bytesField: Option[com.linkedin.data.ByteString] = Option(obtainDirect(WithOptionalPrimitiveTyperefs.Fields.bytesField, classOf[com.linkedin.data.ByteString], GetMode.STRICT))
      
  

  
  private def setFields(intField: Option[Int], longField: Option[Long], floatField: Option[Float], doubleField: Option[Double], booleanField: Option[Boolean], stringField: Option[String], bytesField: Option[com.linkedin.data.ByteString]): Unit = {
    
      
      
          intField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.intField, classOf[java.lang.Integer], Int.box(value)))
        
    
      
      
          longField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.longField, classOf[java.lang.Long], Long.box(value)))
        
    
      
      
          floatField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.floatField, classOf[java.lang.Float], Float.box(value)))
        
    
      
      
          doubleField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.doubleField, classOf[java.lang.Double], Double.box(value)))
        
    
      
      
          booleanField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.booleanField, classOf[java.lang.Boolean], Boolean.box(value)))
        
    
      
      
          stringField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.stringField, classOf[java.lang.String], value))
        
    
      
      
          bytesField.foreach(value =>  putDirect(WithOptionalPrimitiveTyperefs.Fields.bytesField, classOf[com.linkedin.data.ByteString], value))
        
    
  }

  override val productArity: Int = 7

  override def productElement(n: Int): Any =
    n match {
      
      case 0 => intField
      case 1 => longField
      case 2 => floatField
      case 3 => doubleField
      case 4 => booleanField
      case 5 => stringField
      case 6 => bytesField
      case _ => throw new IndexOutOfBoundsException(n.toString)
    }

  override val productPrefix: String = "WithOptionalPrimitiveTyperefs"

  override def canEqual(that: Any): Boolean = that.isInstanceOf[WithOptionalPrimitiveTyperefs]

  override def hashCode: Int = ScalaRunTime._hashCode(this)

  override def equals(that: Any): Boolean = ScalaRunTime._equals(this, that)

  override def toString: String = ScalaRunTime._toString(this)

  def copy(intField: Option[Int] = this.intField, longField: Option[Long] = this.longField, floatField: Option[Float] = this.floatField, doubleField: Option[Double] = this.doubleField, booleanField: Option[Boolean] = this.booleanField, stringField: Option[String] = this.stringField, bytesField: Option[com.linkedin.data.ByteString] = this.bytesField): WithOptionalPrimitiveTyperefs = {
    val dataMap = new DataMap
    val result = new WithOptionalPrimitiveTyperefs(dataMap)
    result.setFields(intField, longField, floatField, doubleField, booleanField, stringField, bytesField)
    dataMap.setReadOnly()
    result
  }
}

object WithOptionalPrimitiveTyperefs {
  private val SCHEMA = DataTemplateUtil.parseSchema("""{"type":"record","name":"WithOptionalPrimitiveTyperefs","namespace":"org.coursera.records.test","fields":[{"name":"intField","type":{"type":"typeref","name":"OptionalIntTyperef","ref":"int"},"optional":true},{"name":"longField","type":{"type":"typeref","name":"OptionalLongTyperef","ref":"long"},"optional":true},{"name":"floatField","type":{"type":"typeref","name":"OptionalFloatTyperef","ref":"float"},"optional":true},{"name":"doubleField","type":{"type":"typeref","name":"OptionalDoubleTyperef","ref":"double"},"optional":true},{"name":"booleanField","type":{"type":"typeref","name":"OptionalBooleanTyperef","ref":"boolean"},"optional":true},{"name":"stringField","type":{"type":"typeref","name":"OptionalStringTyperef","ref":"string"},"optional":true},{"name":"bytesField","type":{"type":"typeref","name":"OptionalBytesTyperef","ref":"bytes"},"optional":true}]}""").asInstanceOf[RecordDataSchema]

  
  

  
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  

  private object Fields {
    
    val intField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("intField")
    val longField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("longField")
    val floatField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("floatField")
    val doubleField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("doubleField")
    val booleanField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("booleanField")
    val stringField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("stringField")
    val bytesField = WithOptionalPrimitiveTyperefs.SCHEMA.getField("bytesField")
  }

  def apply(intField: Option[Int], longField: Option[Long], floatField: Option[Float], doubleField: Option[Double], booleanField: Option[Boolean], stringField: Option[String], bytesField: Option[com.linkedin.data.ByteString]): WithOptionalPrimitiveTyperefs = {
    val dataMap = new DataMap
    val result = new WithOptionalPrimitiveTyperefs(dataMap)
    result.setFields(intField, longField, floatField, doubleField, booleanField, stringField, bytesField)
    dataMap.setReadOnly()
    result
  }

  def apply(dataMap: DataMap, conversion: DataConversion): WithOptionalPrimitiveTyperefs = {
    new WithOptionalPrimitiveTyperefs(DataTemplates.makeImmutable(dataMap, SCHEMA, conversion))
  }

  def unapply(record: WithOptionalPrimitiveTyperefs): Option[(Option[Int], Option[Long], Option[Float], Option[Double], Option[Boolean], Option[String], Option[com.linkedin.data.ByteString])] = {
    try {
      Some((record.intField, record.longField, record.floatField, record.doubleField, record.booleanField, record.stringField, record.bytesField))
    } catch {
      case cast: TemplateOutputCastException => None
      case notPresent: RequiredFieldNotPresentException => None
    }
  }
}

