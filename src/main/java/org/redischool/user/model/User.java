package org.redischool.user.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Value
@EqualsAndHashCode(of = { "id" })
@Builder(toBuilder = true)
@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;

    private String email;

}
