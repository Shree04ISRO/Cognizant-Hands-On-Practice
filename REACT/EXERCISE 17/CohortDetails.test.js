import React from "react";
import { shallow } from "enzyme";
import CohortDetails from "./CohortDetails";
import { CohortsData } from "./Cohort";

describe("CohortDetails Component", () => {

    const wrapper = shallow(
        <CohortDetails cohort={CohortsData[0]} />
    );

    test("should create the component", () => {
        expect(wrapper.exists()).toBe(true);
    });

    test("should initialize the props", () => {
    expect(wrapper.instance()).toBeDefined();
    expect(wrapper.find("h3").text()).toContain("INTADMDF10");
});

    test("should display cohort code inside h3", () => {
        expect(wrapper.find("h3").text()).toContain("INTADMDF10");
    });

    test("should match snapshot", () => {
        expect(wrapper).toMatchSnapshot();
    });

});