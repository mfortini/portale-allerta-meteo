//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:46:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsEsitoUnico;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECEsitoRicFormatoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ECEsitoRicFormatoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="POSITIVO"/>
 *     &lt;enumeration value="NEGATIVO"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="DISABILITATO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECEsitoRicFormatoType")
@XmlEnum
public enum ECEsitoRicFormatoType {

    POSITIVO,
    NEGATIVO,
    WARNING,
    DISABILITATO;

    public String value() {
        return name();
    }

    public static ECEsitoRicFormatoType fromValue(String v) {
        return valueOf(v);
    }

}
