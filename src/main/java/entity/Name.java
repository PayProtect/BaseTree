package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table( name = "Name" )
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
    @Column
    public NoteRef note_list;



}
