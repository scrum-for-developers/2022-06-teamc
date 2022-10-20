package de.codecentric.psd.worblehat.web.formdata;

import de.codecentric.psd.worblehat.web.validation.ISBN;
import de.codecentric.psd.worblehat.web.validation.Numeric;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/** This class represent the form data of the add book form. */
public class BookDataFormData {

  @NotEmpty(message = "Bitte einen Titel eingeben")
  private String title;

  @NotEmpty(message = "Bitte eine Auflage eingeben")
  @Numeric(message = "Die Auflage muss ein numerischer Wert sein")
  private String edition;

  @NotEmpty(message = "Bitte ein Herausgabejahr angeben")
  @Numeric(message = "Das Herausgabejahr muss ein numerischer Wert sein")
  @Min(message = "Das Buch muss nach dem Jahr 1000 verlegt worden sein", value = 1000)
  private String yearOfPublication;

  @NotEmpty(message = "Bitte eine ISBN eingeben")
  @ISBN(message = "Bitte eine gültige ISBN angeben")
  @Min(message = "Die ISBN besteht aus weniger als 10 Ziffern", value = 999999999)
  @Max(message = "Die ISBN besteht aus mehr als 10 Ziffern", value = 1000000000)
  private String isbn;

  @NotEmpty(message = "Bitte eine_n Autor_in angeben")
  private String author;

  public String getYearOfPublication() {
    return yearOfPublication;
  }

  public void setYearOfPublication(String yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  @Override
  public String toString() {
    return "BookDataFormData [title="
        + title
        + ", edition="
        + edition
        + ", yearOfPublication="
        + yearOfPublication
        + ", isbn="
        + isbn
        + ", author="
        + author
        + "]";
  }
}
