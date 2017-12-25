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


}
