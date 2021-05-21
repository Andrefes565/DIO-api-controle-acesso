package com.andreFelipe.controleAcesso.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

@Entity
public class BancoHoras {


    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;

    }

    @EmbeddedId
    private BancoHorasId bancoHorasId;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHTrabalhadas;
    private BigDecimal saldoHoras;
}
