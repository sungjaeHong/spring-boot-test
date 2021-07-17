package com.sungjae.springboottest.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2021/07/17
 */
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Account extends BaseEntity {
    private BigDecimal balance;
    @OneToMany
    private List<Deposit> deposits = new ArrayList<>();
}
