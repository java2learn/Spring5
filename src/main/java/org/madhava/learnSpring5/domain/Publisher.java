package org.madhava.learnSpring5.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pName;
    private String pAddress;

    @OneToMany
    @JoinColumn(name="publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
    }

    public Publisher(String pName, String pAddress) {
        this.pName = pName;
        this.pAddress = pAddress;
    }

    public Publisher(String pName, String pAddress, Set<Book> books) {
        this.pName = pName;
        this.pAddress = pAddress;
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "pName='" + pName + '\'' +
                ", pAddress='" + pAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (pName != null ? !pName.equals(publisher.pName) : publisher.pName != null) return false;
        return pAddress != null ? pAddress.equals(publisher.pAddress) : publisher.pAddress == null;
    }

    @Override
    public int hashCode() {
        int result = pName != null ? pName.hashCode() : 0;
        result = 31 * result + (pAddress != null ? pAddress.hashCode() : 0);
        return result;
    }

}

