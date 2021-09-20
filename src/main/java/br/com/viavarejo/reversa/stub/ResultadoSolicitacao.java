//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.09.19 às 02:10:34 PM BRT 
//


package br.com.viavarejo.reversa.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de resultadoSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="resultadoSolicitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_coleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_etiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status_objeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_solicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_solicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo_erro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="descricao_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoSolicitacao", propOrder = {
    "tipo",
    "idCliente",
    "numeroColeta",
    "numeroEtiqueta",
    "idObj",
    "statusObjeto",
    "prazo",
    "dataSolicitacao",
    "horaSolicitacao",
    "codigoErro",
    "descricaoErro"
})
public class ResultadoSolicitacao {

    protected String tipo;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(name = "numero_coleta")
    protected String numeroColeta;
    @XmlElement(name = "numero_etiqueta")
    protected String numeroEtiqueta;
    @XmlElement(name = "id_obj")
    protected String idObj;
    @XmlElement(name = "status_objeto")
    protected String statusObjeto;
    protected String prazo;
    @XmlElement(name = "data_solicitacao")
    protected String dataSolicitacao;
    @XmlElement(name = "hora_solicitacao")
    protected String horaSolicitacao;
    @XmlElement(name = "codigo_erro")
    protected long codigoErro;
    @XmlElement(name = "descricao_erro")
    protected String descricaoErro;

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade numeroColeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroColeta() {
        return numeroColeta;
    }

    /**
     * Define o valor da propriedade numeroColeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroColeta(String value) {
        this.numeroColeta = value;
    }

    /**
     * Obtém o valor da propriedade numeroEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    /**
     * Define o valor da propriedade numeroEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtiqueta(String value) {
        this.numeroEtiqueta = value;
    }

    /**
     * Obtém o valor da propriedade idObj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObj() {
        return idObj;
    }

    /**
     * Define o valor da propriedade idObj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObj(String value) {
        this.idObj = value;
    }

    /**
     * Obtém o valor da propriedade statusObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusObjeto() {
        return statusObjeto;
    }

    /**
     * Define o valor da propriedade statusObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusObjeto(String value) {
        this.statusObjeto = value;
    }

    /**
     * Obtém o valor da propriedade prazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrazo() {
        return prazo;
    }

    /**
     * Define o valor da propriedade prazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrazo(String value) {
        this.prazo = value;
    }

    /**
     * Obtém o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSolicitacao(String value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade horaSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSolicitacao() {
        return horaSolicitacao;
    }

    /**
     * Define o valor da propriedade horaSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSolicitacao(String value) {
        this.horaSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoErro.
     * 
     */
    public long getCodigoErro() {
        return codigoErro;
    }

    /**
     * Define o valor da propriedade codigoErro.
     * 
     */
    public void setCodigoErro(long value) {
        this.codigoErro = value;
    }

    /**
     * Obtém o valor da propriedade descricaoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Define o valor da propriedade descricaoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

    public String toString (){
        return new String(
                "Tipo: "+tipo+ "\n" +
                        "Id cliente: "+ idCliente + "\n" +
                        "Num coleta: "+ numeroColeta+"\n" +
                        "Etiqueta: "+ numeroEtiqueta +"\n" +
                        "Id objeto: "+ idObj +"\n" +
                        "Status: "+ statusObjeto+"\n" +
                        "Prazo: "+ prazo+"\n" +
                        "Data Solicitação: "+ dataSolicitacao+"\n" +
                        "Hora Solcitação: "+ horaSolicitacao+"\n" +
                        "Codigo Erro: "+ codigoErro+"\n" +
                        "Descrição Erro: "+ descricaoErro);
    }

}
