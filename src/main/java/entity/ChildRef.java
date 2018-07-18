package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class ChildRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @ManyToOne
    @JoinColumn
    public Person person_ref;

    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Person getPerson_ref() {
        return person_ref;
    }

    public void setPerson_ref(Person person_ref) {
        person_ref = person_ref;
    }

    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

}
