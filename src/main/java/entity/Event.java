package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Event" )
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public  String type;

    @Column
    public Date date;

    @Column
    public String description;

    @Column
    public NoteRef note_list;

    @Column
    public MediaRef media_list;

    @Column
    public String change;


}
