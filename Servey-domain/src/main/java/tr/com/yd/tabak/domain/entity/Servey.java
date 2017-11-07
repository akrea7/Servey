package tr.com.yd.tabak.domain.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SERVEY")
@SequenceGenerator(name = "seqGenerator", sequenceName = "SERVEY_SEQ", allocationSize = 1)
public class Servey extends BaseEntity{

}
