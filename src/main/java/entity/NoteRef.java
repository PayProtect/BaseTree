package entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class NoteRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @ManyToOne
    @JoinColumn
    public NoteRef note_list;


    @OneToMany(targetEntity=MediaRef.class, mappedBy="media_ref")
    public Set<MediaRef> media_ref;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }

    public Set<MediaRef> getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(Set<MediaRef> media_ref) {
        this.media_ref = media_ref;
    }
}
