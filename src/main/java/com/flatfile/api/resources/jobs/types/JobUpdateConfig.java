/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.flatfile.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = JobUpdateConfig.Deserializer.class)
public final class JobUpdateConfig {
    private final Object value;

    private final int type;

    private JobUpdateConfig(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((DeleteRecordsJobConfig) this.value);
        } else if (this.type == 1) {
            return visitor.visit((FileJobConfig) this.value);
        } else if (this.type == 2) {
            return visitor.visit((PipelineJobConfig) this.value);
        } else if (this.type == 3) {
            return visitor.visit((ExportJobConfig) this.value);
        } else if (this.type == 4) {
            return visitor.visit((MutateJobConfig) this.value);
        } else if (this.type == 5) {
            return visitor.visit((FindAndReplaceJobConfig) this.value);
        } else if (this.type == 6) {
            return visitor.visit((MappingProgramJobConfig) this.value);
        } else if (this.type == 7) {
            return visitor.visit((EmptyObject) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobUpdateConfig && equalTo((JobUpdateConfig) other);
    }

    private boolean equalTo(JobUpdateConfig other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static JobUpdateConfig of(DeleteRecordsJobConfig value) {
        return new JobUpdateConfig(value, 0);
    }

    public static JobUpdateConfig of(FileJobConfig value) {
        return new JobUpdateConfig(value, 1);
    }

    public static JobUpdateConfig of(PipelineJobConfig value) {
        return new JobUpdateConfig(value, 2);
    }

    public static JobUpdateConfig of(ExportJobConfig value) {
        return new JobUpdateConfig(value, 3);
    }

    public static JobUpdateConfig of(MutateJobConfig value) {
        return new JobUpdateConfig(value, 4);
    }

    public static JobUpdateConfig of(FindAndReplaceJobConfig value) {
        return new JobUpdateConfig(value, 5);
    }

    public static JobUpdateConfig of(MappingProgramJobConfig value) {
        return new JobUpdateConfig(value, 6);
    }

    public static JobUpdateConfig of(EmptyObject value) {
        return new JobUpdateConfig(value, 7);
    }

    public interface Visitor<T> {
        T visit(DeleteRecordsJobConfig value);

        T visit(FileJobConfig value);

        T visit(PipelineJobConfig value);

        T visit(ExportJobConfig value);

        T visit(MutateJobConfig value);

        T visit(FindAndReplaceJobConfig value);

        T visit(MappingProgramJobConfig value);

        T visit(EmptyObject value);
    }

    static final class Deserializer extends StdDeserializer<JobUpdateConfig> {
        Deserializer() {
            super(JobUpdateConfig.class);
        }

        @java.lang.Override
        public JobUpdateConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, DeleteRecordsJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, FileJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, PipelineJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ExportJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, MutateJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, FindAndReplaceJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, MappingProgramJobConfig.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, EmptyObject.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
