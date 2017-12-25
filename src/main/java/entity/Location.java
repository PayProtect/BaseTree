package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table( name = "Location" )
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String country;

    @Column
    public String city;
    @Column
    public String state;
    @Column
    public String street;
    @Column
    public String postal;
    @Column
    public String phone;


}
