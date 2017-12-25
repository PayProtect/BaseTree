package entity;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table( name = "Media" )
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String path;

    @Column
    public Blob mediafile;
    @Column
    public String description;
    @Column
    public String checksum;
    @Column
    public String change;



}
