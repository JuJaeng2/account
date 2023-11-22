package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//JPA Auditing은 엔티티(Entities)의 변경을 추적하고, 생성일과 수정일 같은 메타데이터를 자동으로 관리해주는 기능을 제공
//이 설정을 사용하면,
// JPA 엔티티 클래스에서 @CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy 어노테이션을 사용하여 각각 생성일, 수정일, 생성자, 수정자와 관련된 필드를 선언할 수 있습니다.
public class JpaAuditingConfiguration {
}
