/*
 Copyright 2015 Coursera Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.coursera.courier.companions

import com.linkedin.data.DataMap
import com.linkedin.data.schema.UnionDataSchema
import org.coursera.courier.templates.DataTemplates.DataConversion
import org.coursera.courier.templates.ScalaUnionTemplate

/**
 * Identifies companion objects of the Scala union "template" classes generated by Courier.
 */
trait UnionCompanion[K <: ScalaUnionTemplate] extends SchemaAware {
  override def SCHEMA: UnionDataSchema
  def build(dataMap: DataMap, conversion: DataConversion): K
}
