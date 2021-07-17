package com.sungjae.springboottest.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by peter on 2021/07/17
 */

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Deposit extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    Account account;
    BigDecimal amount;
}
