//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.09.19 �s 02:10:34 PM BRT 
//


package br.com.viavarejo.reversa.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitarRangeResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitarRangeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="solicitarRange" type="{http://service.logisticareversa.correios.com.br/}retornoFaixaNumerica" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitarRangeResponse", propOrder = {
    "solicitarRange"
})
public class SolicitarRangeResponse {

    protected RetornoFaixaNumerica solicitarRange;

    /**
     * Obt�m o valor da propriedade solicitarRange.
     * 
     * @return
     *     possible object is
     *     {@link RetornoFaixaNumerica }
     *     
     */
    public RetornoFaixaNumerica getSolicitarRange() {
        return solicitarRange;
    }

    /**
     * Define o valor da propriedade solicitarRange.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoFaixaNumerica }
     *     
     */
    public void setSolicitarRange(RetornoFaixaNumerica value) {
        this.solicitarRange = value;
    }

}
