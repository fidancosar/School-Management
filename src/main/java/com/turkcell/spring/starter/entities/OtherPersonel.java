package com.turkcell.spring.starter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "other_personel")

public class OtherPersonel {
    @GeneratedValue()
    @Id
    @Column(name = "other_personel_id")
    private int otherPersonelId;
    @Column(name = "other_personel_name")
    private String otherPersonelName;

    @ManyToOne
    @JoinColumn (name = "school_id")
    private School schools;

}
