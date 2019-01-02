package io.swagger.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Template
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:48:53.126Z")
@XmlRootElement(name = "Template")
public class Template   implements Serializable {

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("html")
  private String html = null;

  /**
   * template status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    DISABLE("disable");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;



  @JsonProperty("createdDate")
  private Date createdDate;


  @JsonProperty("lastUpdatedDate")
  private Date lastUpdatedDate;


  public Template id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Template name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Template html(String html) {
    this.html = html;
    return this;
  }

  /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(example = "<html></html>", required = true, value = "")
  @NotNull


  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public Template status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * template status in the store
   * @return status
  **/
  @ApiModelProperty(value = "template status in the store")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.id, template.id) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this.html, template.html) &&
        Objects.equals(this.status, template.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, html, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  public Date getcreatedDate() {
    return createdDate;
  }

  public void setcreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public Date getlastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setlastUpdatedDate(Date lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

