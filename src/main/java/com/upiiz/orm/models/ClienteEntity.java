package com.upiiz.orm.models;

// Base de datos o persistencia
import jakarta.persistence.*;
// Validacion antes de ingresar a la base de datos
import jakarta.validation.constraints.*;
// Ahorrar codigo
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Generar los setters y getters
 */
@Data
/**
 * Constructor con parametros
 */
@AllArgsConstructor
/**
 * Constructor sin argumentos
 */
@NoArgsConstructor
/**
 * Mapear esta Clase -> Tabla de la base de datos
 */
@Entity
/**
 * ClienteEntity -> cliente
 */
@Table(name = "cliente")
public class ClienteEntity {
    /**
     * Mapear (ORM)
     * Reducir código (Lombok) y
     * Validar (Validate)
     */

    /**
     * Esta es la llave primaria y que MySQL genere el ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // En caso de requerir un nombre diferente al de la clase
    @NotBlank
    @Size(min = 3, message = "El nombre del cliente debe tener minimo 3 letras")
    @Column(name = "nombre_cliente")
    private String nombre;

    @NotBlank(message = "Se debe de ingresar un apellido")
    private String apellido;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    private String telefono;

    @NotBlank
    private String direccion;

    @Min(18)
    private int edad;

    @NotBlank
    private String rfc;

}
