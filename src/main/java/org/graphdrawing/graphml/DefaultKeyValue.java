package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
* GraphML library
* %%
* Copyright (C) 2011 - 2014 jutility.org
* %%
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*      http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* #L%
*/
//@formatter:on



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Complex type for the {@code <default>} element. default.type is mixed, that
 * is, data may contain #PCDATA. Content type: extension of data-extension.type
 * which is empty per default.
 * 
 * 
 * <p>
 * Java class for default.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="default.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://graphml.graphdrawing.org/xmlns}data-extension.type"&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}default.extra.attrib"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default.type")
public class DefaultKeyValue
        extends KeyDataExtension {

    // Adapter class.
}
