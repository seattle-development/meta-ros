# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "The system modes concept assumes that a robotics system is built     from components with a lifecycle. It adds a notion of (sub-)systems,     hiararchically grouping these nodes, as well as a notion of modes     that determine the configuration of these nodes and (sub-)systems in     terms of their parameter values."
AUTHOR = "Arne Nordmann <arne.nordmann@bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "system_modes"
ROS_BPN = "system_modes"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclcpp-lifecycle \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclcpp-lifecycle \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    launch-ros \
    rclcpp \
    rclcpp-lifecycle \
    rosidl-default-generators \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/system_modes-release/archive/release/rolling/system_modes/0.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/system_modes"
SRC_URI = "git://github.com/ros2-gbp/system_modes-release;${ROS_BRANCH};protocol=https"
SRCREV = "94174a00a9fdd97a82b0a79ea42432c111ac7441"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}