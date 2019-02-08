package com.github.gorgestar.isn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.gorgestar.isn.model.Users;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewPost
 */

public class NewPost   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("auther")
  private Users auther = null;

  public NewPost title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NewPost auther(Users auther) {
    this.auther = auther;
    return this;
  }

  /**
   * Get auther
   * @return auther
  */
  @ApiModelProperty(value = "")

  @Valid

  public Users getAuther() {
    return auther;
  }

  public void setAuther(Users auther) {
    this.auther = auther;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPost newPost = (NewPost) o;
    return Objects.equals(this.title, newPost.title) &&
        Objects.equals(this.auther, newPost.auther);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, auther);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPost {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    auther: ").append(toIndentedString(auther)).append("\n");
    sb.append("}");
    return sb.toString();
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

