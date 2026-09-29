package hu.unideb.inf.model;

import java.time.LocalDate;

public class Model {
    private Student student;

    public Model() {
        student = new Student("Robert Smith",
                                   18,
                                    LocalDate.of(2026,9,29));

    }

    public Student getStudent() {
        return student;
    }
}
