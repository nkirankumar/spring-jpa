# spring-jpa
Annotation | Description
--------|------------
@Entity| This annotation specifies to declare the class as entity or a table.
@Table| This annotation specifies to declare table name.
@Basic| This annotation specifies non constraint fields explicitly.
@Embedded| This annotation specifies the properties of class or an entity whose value instance of an embeddable class.
@Id| This annotation specifies the property, use for identity (primary key of a table) of the class.
@GeneratedValue| This annotation specifies, how the identity attribute can be initialized such as Automatic, manual, or value taken from sequence table.
@Transient| This annotation specifies the property which in not persistent i.e. the value is never stored into database.
@Column| This annotation is used to specify column or attribute for persistence property.
@SequenceGenerator| This annotation is used to define the value for the property which is specified in @GeneratedValue annotation. It creates a sequence.
@TableGenerator| This annotation is used to specify the value generator for property specified in @GeneratedValue annotation. It creates a table for value generation.
@AccessType| This type of annotation is used to set the access type. If you set @AccessType(FIELD) then Field wise access will occur. If you set @AccessType(PROPERTY) then Property wise assess will occur.
@JoinColumn| This annotation is used to specify an entity association or entity collection. This is used in many- to-one and one-to-many associations.
@UniqueConstraint| This annotation is used to specify the field, unique constraint for primary or secondary table.
@ColumnResult| This annotation references the name of a column in the SQL query using select clause.
@ManyToMany|This annotation is used to define a many-to-many relationship between the join Tables.
@ManyToOne|This annotation is used to define a many-to-one relationship between the join Tables.
@OneToMany|This annotation is used to define a one-to-many relationship between the join Tables.
@OneToOne|This annotation is used to define a one-to-one relationship between the join Tables.
@NamedQueries|This annotation is used for specifying list of named queries.
@NamedQuery|This annotation is used for specifying a Query using static name.