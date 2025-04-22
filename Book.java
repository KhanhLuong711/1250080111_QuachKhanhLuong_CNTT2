package labtuan2;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    // Constructor mặc định
    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }

    // Constructor đầy đủ
    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    // Constructor sao chép
    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    // Getters
    public String getboCode() {
        return boCode;
    }

    public String getboTitle() {
        return boTitle;
    }

    public String getboAuthor() {
        return boAuthor;
    }
}