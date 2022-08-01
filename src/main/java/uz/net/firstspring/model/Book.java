package uz.net.firstspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Book {
    private Integer id;
    private String name;
    private Double price;
    private String authorName;

}
