package bibim.backend.domain.dto;

import bibim.backend.domain.Post;

public record CreatePostDto(
        String title,
        String content
) {
}
