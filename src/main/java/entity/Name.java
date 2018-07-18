package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table
public class Name {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public Date date;

    @Column
    public String first_name;

    @Column
    public String surname;

    @Column
    public String suffix;
    @Column
    public String title;
    @Column
    public String name_type;
    @Column
    public String prefix;
    @Column
    public String patronymic;


    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }
}
