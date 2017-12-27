package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "AddressRef" )
public class AddressRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public Date date;

    @Column
    public Location location;

    @Column
    public  NoteRef note_list;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }
}
