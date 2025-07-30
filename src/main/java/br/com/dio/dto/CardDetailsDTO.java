package br.com.dio.dto;

import java.time.OffsetDateTime;

public record CardDetailsDTO(
                            String title,
                            String description,
                            Long id,
                            boolean blocked,
                            OffsetDateTime blockedAt,
                            String blockReason,
                            int blocksAmount,
                            Long columnId,
                            String columnName
) {
}
