package org.docking.erbse.service;

import java.util.List;

import org.docking.erbse.dao.service.GenericService;
import org.docking.erbse.dao.serviceImpl.GenericServiceImpl;
import org.docking.erbse.util.JsonParser;
import org.docking.erbse.vo.EditorReviewBBSVO;


public class ReviewServiceImpl implements ReviewService {

	@Override
	public Integer reviewAdd(EditorReviewBBSVO editorReview) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.add("editorReivew_add", editorReview);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public Integer reviewModify(EditorReviewBBSVO editorReview) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.modify("editorReview_modify", editorReview);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public Integer reviewDelete(String reviewId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.delete("editorReview_delete", reviewId);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public String reviewSearch(String reviewId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		EditorReviewBBSVO ervo = reviewService.search("editorReview_search", reviewId);

		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewList() {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll");
		
		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewListByEditor(String editorId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll_key", editorId);

		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewListByWriter(String memberId) {
/*		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll_key", memberId);

		String jRes = null;
		JsonParser.getInstance();
		
		 * Json Ÿ�� ĳ���� �ʿ�
		 
		return jRes;*/
		
		/*
		 * Writer �� ����˻� ���;���.
		 */
		return null;
	}
}