package org.delivery.db.account;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.delivery.db.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "account")
public class AccountEntity extends BaseEntity {

}
