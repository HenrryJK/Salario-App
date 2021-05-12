
package com.soaps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soaps package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularSalario_QNAME = new QName("http://soaps.com/", "calcularSalario");
    private final static QName _CalcularSalarioResponse_QNAME = new QName("http://soaps.com/", "calcularSalarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soaps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularSalarioResponse }
     * 
     */
    public CalcularSalarioResponse createCalcularSalarioResponse() {
        return new CalcularSalarioResponse();
    }

    /**
     * Create an instance of {@link CalcularSalario }
     * 
     */
    public CalcularSalario createCalcularSalario() {
        return new CalcularSalario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSalario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soaps.com/", name = "calcularSalario")
    public JAXBElement<CalcularSalario> createCalcularSalario(CalcularSalario value) {
        return new JAXBElement<CalcularSalario>(_CalcularSalario_QNAME, CalcularSalario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSalarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soaps.com/", name = "calcularSalarioResponse")
    public JAXBElement<CalcularSalarioResponse> createCalcularSalarioResponse(CalcularSalarioResponse value) {
        return new JAXBElement<CalcularSalarioResponse>(_CalcularSalarioResponse_QNAME, CalcularSalarioResponse.class, null, value);
    }

}
