package academy.digitallab.serviceproduct.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre del campo no debe ser vacío")
    private String name; //Si el nombre de tu columna en la bdd es el mismo no necesita ninguna decoracion
    private String description;
    @Positive(message = "El stock debe ser mayor que cero")
    private Double stock;
    private Double price;
    private String status;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt; //Caso contrario, si el nombre es diferente usa la decoracion @Column

    /*Como nuestra bdd es una bdd embebida aqui estamos relacionando con @ManyToOne de uno a muchos
     es decir muchos productos tienen una categoria
      Aparte FetchType.LAZY carga los datos de manera peresoza osea en el momento que se requieran
      FetchType.EAGER carga todos los valores de la categoria
     */
    @NotNull(message = "La categoria no puede ser vacia")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")  //la relacion de id con lo que se va a mapear
    @JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
    private Category category;


}
