package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "ChildRef" )
public class ChildRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public Person Person_ref;

    @Column
    public NoteRef note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Person getPerson_ref() {
        return Person_ref;
    }

    public void setPerson_ref(Person person_ref) {
        Person_ref = person_ref;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }
}
