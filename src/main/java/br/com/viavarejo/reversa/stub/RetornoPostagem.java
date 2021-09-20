//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.09.19 �s 02:10:34 PM BRT 
//


package br.com.viavarejo.reversa.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de retornoPostagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retornoPostagem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status_processamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_processamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_processamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cod_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msg_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado_solicitacao" type="{http://service.logisticareversa.correios.com.br/}resultadoSolicitacao" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoPostagem", propOrder = {
    "statusProcessamento",
    "dataProcessamento",
    "horaProcessamento",
    "codErro",
    "msgErro",
    "resultadoSolicitacao"
})
public class RetornoPostagem {

    @XmlElement(name = "status_processamento")
    protected String statusProcessamento;
    @XmlElement(name = "data_processamento")
    protected String dataProcessamento;
    @XmlElement(name = "hora_processamento")
    protected String horaProcessamento;
    @XmlElement(name = "cod_erro")
    protected String codErro;
    @XmlElement(name = "msg_erro")
    protected String msgErro;
    @XmlElement(name = "resultado_solicitacao", nillable = true)
    protected List<ResultadoSolicitacao> resultadoSolicitacao;

    /**
     * Obt�m o valor da propriedade statusProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProcessamento() {
        return statusProcessamento;
    }

    /**
     * Define o valor da propriedade statusProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProcessamento(String value) {
        this.statusProcessamento = value;
    }

    /**
     * Obt�m o valor da propriedade dataProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProcessamento() {
        return dataProcessamento;
    }

    /**
     * Define o valor da propriedade dataProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProcessamento(String value) {
        this.dataProcessamento = value;
    }

    /**
     * Obt�m o valor da propriedade horaProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraProcessamento() {
        return horaProcessamento;
    }

    /**
     * Define o valor da propriedade horaProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraProcessamento(String value) {
        this.horaProcessamento = value;
    }

    /**
     * Obt�m o valor da propriedade codErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodErro() {
        return codErro;
    }

    /**
     * Define o valor da propriedade codErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodErro(String value) {
        this.codErro = value;
    }

    /**
     * Obt�m o valor da propriedade msgErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Define o valor da propriedade msgErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

    /**
     * Gets the value of the resultadoSolicitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultadoSolicitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultadoSolicitacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadoSolicitacao }
     * 
     * 
     */
    public List<ResultadoSolicitacao> getResultadoSolicitacao() {
        if (resultadoSolicitacao == null) {
            resultadoSolicitacao = new ArrayList<ResultadoSolicitacao>();
        }
        return this.resultadoSolicitacao;
    }

}
