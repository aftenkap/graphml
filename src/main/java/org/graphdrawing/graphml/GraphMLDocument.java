package org.graphdrawing.graphml;

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



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * 
 * Complex type for the {@code <graphml>} element.
 * 
 * 
 * <p>
 * Java class for graphml.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="graphml.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}keys" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://graphml.graphdrawing.org/xmlns}graph"/>
 *             &lt;element ref="{http://graphml.graphdrawing.org/xmlns}data"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}graphml.extra.attrib"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphml.type", propOrder = { "description", "keys", "keyData",
        "graphs" })
@XmlRootElement(name = "graphml")
public class GraphMLDocument
        implements IKeyDataContainer {

    @XmlElement(name = "desc")
    private String        description;
    @XmlElement(name = "key")
    private List<Key>     keys;

    @XmlElement(name = "data")
    private List<KeyData> keyData;

    @XmlElement(name = "graph")
    private List<Graph>   graphs;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {

        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {

        this.description = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the keys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Key }
     * 
     * @return a {@link List} of {@link Key Keys}.
     */
    public List<Key> getKeys() {

        if (keys == null) {
            keys = new ArrayList<Key>();
        }
        return this.keys;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the graphs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link KeyData }
     * 
     * @return a {@link List} of {@link KeyData}.
     */
    @Override
    public List<KeyData> getKeyData() {

        if (keyData == null) {
            keyData = new ArrayList<KeyData>();
        }
        return this.keyData;
    }

    /**
     * Gets the value of the graphs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the graphs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGraphs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Graph }
     * 
     * @return a {@link List} of {@link Graph Graphs}.
     */
    public List<Graph> getGraphs() {

        if (graphs == null) {
            graphs = new ArrayList<Graph>();
        }
        return this.graphs;
    }

}
