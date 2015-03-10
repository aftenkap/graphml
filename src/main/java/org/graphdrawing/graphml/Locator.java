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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Complex type for the {@code <locator>} element. Content type: (empty)
 * 
 * 
 * <p>
 * Java class for locator.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="locator.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}locator.extra.attrib"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href use="required""/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locator.type")
public class Locator {

    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink",
            required = true)
    @XmlSchemaType(name = "anyURI")
    private String href;

    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    private String type;

    /**
     * 
     * points to the resource of this locator.
     * 
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHref() {

        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHref(String value) {

        this.href = value;
    }

    /**
     * 
     * type of the hyperlink (fixed as simple).
     * 
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getType() {

        if (type == null) {
            return "simple";
        }
        else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setType(String value) {

        this.type = value;
    }

}
