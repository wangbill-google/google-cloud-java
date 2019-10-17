// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

public interface AcknowledgeTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is
   * to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is
   * to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is
   * to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();
}
