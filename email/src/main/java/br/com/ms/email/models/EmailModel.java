package br.com.ms.email.models;

import br.com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_email")
public class EmailModel implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String ownerRef;
        private String emailFrom;
        private String emailTo;
        private String subject;
        @Column(columnDefinition = "TEXT")
        private String text;
        private LocalDateTime sendDateEmail;
        private StatusEmail statusEmail;

}
