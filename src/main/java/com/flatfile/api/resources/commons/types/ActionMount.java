/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class ActionMount {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ActionMount(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ActionMount sheet(ActionMountSheet value) {
        return new ActionMount(new SheetValue(value));
    }

    public static ActionMount workbook(ActionMountWorkbook value) {
        return new ActionMount(new WorkbookValue(value));
    }

    public static ActionMount field(ActionMountField value) {
        return new ActionMount(new FieldValue(value));
    }

    public static ActionMount document(ActionMountDocument value) {
        return new ActionMount(new DocumentValue(value));
    }

    public static ActionMount file(ActionMountFile value) {
        return new ActionMount(new FileValue(value));
    }

    public boolean isSheet() {
        return value instanceof SheetValue;
    }

    public boolean isWorkbook() {
        return value instanceof WorkbookValue;
    }

    public boolean isField() {
        return value instanceof FieldValue;
    }

    public boolean isDocument() {
        return value instanceof DocumentValue;
    }

    public boolean isFile() {
        return value instanceof FileValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ActionMountSheet> getSheet() {
        if (isSheet()) {
            return Optional.of(((SheetValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionMountWorkbook> getWorkbook() {
        if (isWorkbook()) {
            return Optional.of(((WorkbookValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionMountField> getField() {
        if (isField()) {
            return Optional.of(((FieldValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionMountDocument> getDocument() {
        if (isDocument()) {
            return Optional.of(((DocumentValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionMountFile> getFile() {
        if (isFile()) {
            return Optional.of(((FileValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitSheet(ActionMountSheet sheet);

        T visitWorkbook(ActionMountWorkbook workbook);

        T visitField(ActionMountField field);

        T visitDocument(ActionMountDocument document);

        T visitFile(ActionMountFile file);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(SheetValue.class),
        @JsonSubTypes.Type(WorkbookValue.class),
        @JsonSubTypes.Type(FieldValue.class),
        @JsonSubTypes.Type(DocumentValue.class),
        @JsonSubTypes.Type(FileValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("sheet")
    private static final class SheetValue implements Value {
        @JsonUnwrapped
        private ActionMountSheet value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SheetValue() {}

        private SheetValue(ActionMountSheet value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSheet(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SheetValue && equalTo((SheetValue) other);
        }

        private boolean equalTo(SheetValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("workbook")
    private static final class WorkbookValue implements Value {
        @JsonUnwrapped
        private ActionMountWorkbook value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WorkbookValue() {}

        private WorkbookValue(ActionMountWorkbook value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWorkbook(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WorkbookValue && equalTo((WorkbookValue) other);
        }

        private boolean equalTo(WorkbookValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("field")
    private static final class FieldValue implements Value {
        @JsonUnwrapped
        private ActionMountField value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private FieldValue() {}

        private FieldValue(ActionMountField value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitField(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof FieldValue && equalTo((FieldValue) other);
        }

        private boolean equalTo(FieldValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("document")
    private static final class DocumentValue implements Value {
        @JsonUnwrapped
        private ActionMountDocument value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DocumentValue() {}

        private DocumentValue(ActionMountDocument value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDocument(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DocumentValue && equalTo((DocumentValue) other);
        }

        private boolean equalTo(DocumentValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("file")
    private static final class FileValue implements Value {
        @JsonUnwrapped
        private ActionMountFile value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private FileValue() {}

        private FileValue(ActionMountFile value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitFile(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof FileValue && equalTo((FileValue) other);
        }

        private boolean equalTo(FileValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ActionMount{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
