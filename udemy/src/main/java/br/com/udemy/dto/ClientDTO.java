package br.com.udemy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Integer id;

    @NotBlank(message = "field name can not be empty")
    private String name;

    @NotBlank(message = "field email can not be empty")
    @Email(message = "type a valid email")
    private String email;
}
