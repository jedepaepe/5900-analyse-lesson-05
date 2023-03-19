package eu.epfc.c5900.lesson5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seller extends Stakeholder {
    LocalDate birthDate;
    List<Article> articles = new ArrayList<>();
}
