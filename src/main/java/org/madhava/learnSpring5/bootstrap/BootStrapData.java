package org.madhava.learnSpring5.bootstrap;

import org.madhava.learnSpring5.domain.Author;
import org.madhava.learnSpring5.domain.Book;
import org.madhava.learnSpring5.domain.Publisher;
import org.madhava.learnSpring5.repository.AuthorRepository;
import org.madhava.learnSpring5.repository.BookRepository;
import org.madhava.learnSpring5.repository.PubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRep;
    private final BookRepository bookRep;
    private final PubRepository pubRepo;

    public BootStrapData(AuthorRepository authorRep, BookRepository bookRep, PubRepository pubRepo) {
        this.authorRep = authorRep;
        this.bookRep = bookRep;
        this.pubRepo = pubRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Author anila = new Author("Viraja anila","Garimella");
        Book chandamama = new Book("chandamama","1qaz");
        Publisher mb = new Publisher("Madhava Books","Visakhapatnam");

        anila.getBooks().add(chandamama);
        chandamama.getAuthors().add(anila);
        mb.getBooks().add(chandamama);

        authorRep.save(anila);
        bookRep.save(chandamama);
        pubRepo.save(mb);
        
        Author madhava = new Author("Madhava","M");
        Book ammammaKadhalu = new Book("AmmammaKadhalu","2wsx");
        Publisher gva = new Publisher("GVA Books","Bangalore");

        madhava.getBooks().add(ammammaKadhalu);
        ammammaKadhalu.getAuthors().add(madhava);
        gva.getBooks().add(ammammaKadhalu);

        authorRep.save(madhava); bookRep.save(ammammaKadhalu); pubRepo.save(gva);

        System.out.println("Count of pubRep :: "+pubRepo.count());
        System.out.println("Count of bookRep :: "+bookRep.count());
        System.out.println("Count of authorRep :: "+authorRep.count());


    }
}
