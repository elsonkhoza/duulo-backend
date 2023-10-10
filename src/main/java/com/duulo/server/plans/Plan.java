package com.duulo.server.plans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "plans")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "plan_name")
    String planName;
    @Column(name = "cost_per_week")
    Double costPerWeek;
    @Column(name = "cost_per_month")
    Double costPerMonth;
    @Column(name = "cost_per_year")
    Double costPerYear;

}
