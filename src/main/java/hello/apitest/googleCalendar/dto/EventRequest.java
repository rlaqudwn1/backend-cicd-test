package hello.apitest.googleCalendar.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventRequest {
    // Getter와 Setter
    private String summary;
    private String location;
    private String description;
    private String startTime; // 시작 시간 (예: "2023-10-30T09:00:00+09:00" 형식)
    private String endTime;   // 종료 시간 (예: "2023-10-30T10:00:00+09:00" 형식)

    public void setSummary(String summary) { this.summary = summary; }

    public void setLocation(String location) { this.location = location; }

    public void setDescription(String description) { this.description = description; }

    public void setStartTime(String startTime) { this.startTime = startTime; }

    public void setEndTime(String endTime) { this.endTime = endTime; }
}
